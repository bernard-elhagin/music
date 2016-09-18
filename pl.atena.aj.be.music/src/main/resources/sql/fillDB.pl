#/usr/bin/perl
use strict;
use warnings;

# Pobranie okładek z folderów i odpowiednie ich nazwanie.

use File::Find;
use File::Copy;

my %_seen;

my %_albumIds = %{ populateIds() };

use Data::Dumper;
#print Dumper \%_albumIds; die;

my $_output_dir = 'E:/workspace_szkolenie/akademia-java-be/pl.atena.aj.be.music/src/main/webapp/resources/img/album_covers';

find(\&dir_names, 'M:/Uberized Rips/');

sub process_dir {
    my $dir = shift;

    chdir($dir);

    opendir(my $DIR, $dir);

    foreach my $d (grep { m/jpg/ } readdir($DIR)) {
        print "$dir/$d\n" if $d =~ m/\.jpg$/;

        my $cover = "$dir/$d";

        my $dir_cp = $dir;
        $dir_cp =~ s/^.*\/(.*)$/$1/;

        (undef, undef, my $title) = split / - /, $dir_cp;

        my $output_name = "$_albumIds{$title}.jpg";

		# Commented out to prevent accidentally carrying out
        # copy($cover, "$_output_dir/$output_name");
    }
}

sub dir_names {

    my $dir = $File::Find::dir;

    if (not $_seen{$dir}++) {

        if($dir =~ m/^.+ - \d{4} - .+$/) {
            process_dir($dir);
        }
    }
}

sub populateIds {
    my $hash;

    while (<DATA>) {
        chomp;

        $hash->{$2} = $1 if m/^(\d+?),(.*)$/;
    }

    return $hash;
}

__DATA__
1,Gold (Greatest Hits)
2,At the Pershing But Not for Me
3,Blues At Sunset
4,Live
5,Facelift
6,Dirt
7,At The Fillmore East (Disc 1)
8,At The Fillmore East (Disc 2)
9,Upojenie
10,Caravan
11,Paris Jazz Concert (Disc 1)
12,Paris Jazz Concert (Disc 2)
13,The Best Of The Art Of Noise
14,The Organ Works
15,The Organ Works
16,The Organ Works
17,The Organ Works
18,The Organ Works
19,The Organ Works
20,The Organ Works
21,The Organ Works
22,The Organ Works
23,The Organ Works
24,The Organ Works
25,The Organ Works
26,The Organ Works
27,The Organ Works
28,The Organ Works
29,The Organ Works
30,Really Saying Something
31,In the Flat Field
32,Press the Eject and Give Me the Tape
33,Mask
34,Crackle
35,Beastie Boys Anthology The Sounds of Science (Disc 1)
36,Beastie Boys Anthology The Sounds of Science (Disc 2)
37,The Famous 1938 Carnegie Hall Concert
38,Empress of the Blues
39,The Southern Blues
40,Debut
41,Black Sabbath
42,Paranoid [1986 Reissue]
43,Sabbath Bloody Sabbath
44,Begins (Disc 1)
45,Begins (Disc 2)
46,Treat You Right
47,Play
48,Royal Garden Blues
49,I Heard You Twice the First Time
50,Bloomington
51,Rainy Day
52,Buckshot LeFonque
53,Buckshot LeFonque (Bonus Disc)
54,Music Evolution
55,Carmina Burana (Franz Welser-Möst London Philharmonic)
56,Love Devotion Surrender
57,Village Vanguard Live Sessions (Disc 1)
58,Village Vanguard Live Sessions (Disc 2)
59,Live
60,Garlands
61,Zaprzepaszczone sily wielkiej armii swietych znakow
62,Canto Gregoriano (Disc 1)
63,Canto Gregoriano (Disc 2)
64,Wheels of Fire (Disc 1)
65,Wheels of Fire (Disc 2)
66,Faith
67,Pornography
68,Bloodflowers
69,Homework
70,Beauty of the Baroque
71,Within the Realm of a Dying Sun
72,Into the Labyrinth
73,Spiritchaser
74,Anastasis
75,In Rock
76,Deeper [Single]
77,GLO
78,Audio Lessonover
79,Live At The Fillmore (Disc 1)
80,Live At The Fillmore (Disc 2)
81,No Angel
82,The Great American Standards
83,Dire Straits
84,Communiqué
85,Love Over Gold
86,Time Out
87,The Great Concerts [1958, 1963]
88,Red Clay
89,Straight Life
90,Highway
91,Trespass
92,Nursery Cryme
93,The Lamb Lies Down On Broadway (Disc 1)
94,The Lamb Lies Down On Broadway (Disc 2)
95,Coward Of The County
96,La revancha del tango
97,Hurricane [2011 Reissue] (Disc 1)
98,Hurricane [2011 Reissue] (Disc 2)
99,SIN
100,Proud Like A God
101,An Evening With Herbie Hancock and Chick Corea (Disc 1)
102,An Evening With Herbie Hancock and Chick Corea (Disc 2)
103,Head Hunters [20-Bit 1997 Remaster]
104,V.S.O.P. (Disc 1)
105,V.S.O.P. (Disc 2)
106,Live in Akwarium, Warsaw 1995
107,Music for Babies
108,Freefloater
109,In-A-Gadda-Da-Vida
110,A Scarcity Of Miracles (A King Crimson ProjeKt)
111,At Studio 54
112,Organy
113,Oxygene
114,Equinoxe
115,The Concerts in China
116,Waiting For Cousteau
117,Thick As A Brick
118,Blues
119,The Early Years
120,Walking Into Clarksdale
121,Double Rainbow
122,Not Of This Earth
123,Surfing With the Alien
124,The Extremist
125,Mr. Lucky
126,Zooma
127,Spirit of the Moment
128,Spirit of the Moment
129,Closer
130,Kamien
131,Expectations (Disc 1)
132,Expectations (Disc 2)
133,Changeless
134,In The Court of the Crimson King
135,In the Wake of Poseidon
136,Lizard
137,Islands
138,Red
139,Starless and Bible Black
140,USA [30th Anniversary Edition]
141,Discipline
142,Beat
143,Three of a Perfect Pair
144,THRAK
145,THRaKaTTaK
146,the construKction of light
147,Earthbound [30th Anniversary Edition]
148,Ladies of the Road (Disc 1)
149,Ladies of the Road (Disc 2)
150,The Power To Believe
151,Led Zeppelin
152,Led Zeppelin II
153,Led Zeppelin III
154,(Untitled)
155,Houses Of The Holy
156,Physical Graffiti (Disc 1)
157,Physical Graffiti (Disc 2)
158,Presence
159,The Song Remains the Same (OST) (Disc 1)
160,The Song Remains the Same (OST) (Disc 2)
161,In Through the Out Door
162,Coda
163,Boxed Set (Disc 1)
164,Boxed Set (Disc 2)
165,Boxed Set (Disc 3)
166,Boxed Set (Disc 4)
167,Live Performances (Bootleg)
168,Trampled Underfoot (03-04-75 Bootleg) (Disc 1)
169,Trampled Underfoot (03-05-75 Bootleg) (Disc 2)
170,Boxed Set 2 (Disc 1)
171,Boxed Set 2 (Disc 2)
172,BBC Sessions (Disc 1)
173,BBC Sessions (Disc 2)
174,How The West Was Won (Disc 1)
175,How The West Was Won (Disc 2)
176,How The West Was Won (Disc 3)
177,Leftism
178,Rhythm And Stealth
179,Leftism (Bonus Disc)
180,piano
181,Salt
182,E != mc^2 [1997 Remaster]
183,Fugazi
184,Real To Reel
185,Misplaced Childhood
186,Clutching at Straws
187,Konserthuset Stockholm March 22 1960
188,Live at Newport 1958 (Disc 1)
189,Live at Newport 1958 (Disc 2)
190,Kind Of Blue
191,Sorcerer
192,E.S.P
193,Water Babies
194,Bitches Brew (Disc 1)
195,Bitches Brew (Disc 2)
196,In a Silent Way
197,A Tribute To Jack Johnson
198,On the Corner
199,Big Fun (Disc 1)
200,Big Fun (Disc 2)
201,Pangaea (Disc 1)
202,Pangaea (Disc 2)
203,The Man With The Horn
204,Ballads
205,Aura
206,Circle in the Round (Disc 1)
207,Circle in the Round (Disc 2)
208,The Complete Concert 1964 My Funny Valentine + Four and More (Disc 1)
209,The Complete Concert 1964 My Funny Valentine + Four and More (Disc 2)
210,Miles and Coltrane
211,Sunflower
212,Psalm 69
213,Play
214,Live In Chicago, 1979
215,Kojace Klimaty
216,Milosc w czasach popkultury
217,Blues On Bach
218,puk.puk
219,C.D. (Orbital 1; red CD)
220,The Middle Of Nowhere
221,The Sound of the Trio
222,Metallic Spheres [Deluxe Version] (Disc 1)
223,Metallic Spheres [Deluxe Version] (Disc 2)
224,Adventures Beyond the Ultraworld (Disc 1)
225,Adventures Beyond the Ultraworld (Disc 2)
226,U.F. Orb
227,Live 93 (Disc 1)
228,Live 93 (Disc 2)
229,Orbvs Terrarvm
230,U.F. Off
231,Message From Home
232,Koyaanisqatsi (OST)
233,The First 3 Singles
234,Ummagumma (Disc 1) (Live Disc)
235,Ummagumma (Disc 2) (Studio Album)
236,Meddle
237,Animals
238,Live At Earls Court (June 17, 1981) (Bootleg) (Disc 1)
239,Live At Earls Court (June 17, 1981) (Bootleg) (Disc 2)
240,Home Is Where My Dome Is (Bootleg) (Disc 1)
241,Home Is Where My Dome Is (Bootleg) (Disc 2)
242,The Division Bell
243,p.u.l.s.e (Disc 1)
244,Dummy
245,Elements of Silence
246,Live in Northampton, MA July 1, 1998
247,The Prodigy Experience
248,Firestarter (EP)
249,All Of This And Nothing
250,Rage Against the Machine
251,Hey Now!
252,Californication
253,Live (Disc 1)
254,Live (Disc 2)
255,Landscapes of Middle Earth
256,The Score
257,The Gates of Paradise
258,The Legendary Blues Singer
259,mish mash
260,Vision
261,Nowa Aleksandria
262,Habanera
263,Live Gdynia Summer Jazz Days 2001
264,Underwater Love (Maxi CD)
265,Badmotorfinger
266,The Sky Is Crying
267,Core
268,Feel Good Now
269,Floodland
270,T-Bone Shuffle
271,Phaedra
272,Ricochet
273,Stratosfear
274,Force Majeure
275,White Eagle
276,Hyperborea
277,Poland (The Warsaw Concert)
278,The Hurting
279,Songs From The Big Chair [Remastered]
280,The Seeds Of Love
281,Temple Of The Dog
282,Straight, No Chaser [1996 Reissue]
283,Standards
284,Quake (OST)
285,Spiral
286,Soil Festivities
287,Heavy Weather
288,8 30
289,Mr. Gone
290,Wilki [20th Anniversary Edition] (Disc 1)
291,Wilki [20th Anniversary Edition] (Disc 2)
292,Wynton Marsalis
293,Hot House Flowers
294,Majesty of the Blues
295,The Gold Collection (Disc 1)
296,The Gold Collection (Disc 2)
297,The Midnight Blues (standard time vol. 5)
298,Greatest Jazz Concerts
299,Live at Blues Alley (Disc 1)
300,Live at Blues Alley (Disc 2)
301,Blue Interlude
302,Citi Movement (Griot New York) (Disc 1)
303,Citi Movement (Griot New York) (Disc 2)
304,Live At the Village Vanguard (Bonus Disc)
305,Live At the Village Vanguard
306,Live At the Village Vanguard
307,Live At the Village Vanguard
308,Live At the Village Vanguard
309,Live At the Village Vanguard
310,Live At the Village Vanguard
311,Live At the Village Vanguard
312,Little Games

