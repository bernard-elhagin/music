package pl.atena.aj.be.sklep;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Article> inventory = new ArrayList<Article>();
    
    public class Order {

        private Article article;
        private int quantity;
        private Date orderDate;

        public Order(int amount, Article article) {
            this.setQuantity(amount);
            this.article = article;
            this.setOrderDate(new Date());
        }

        public void accept() {
        	for (int i = 0; i < quantity; i++) {
            	inventory.add(article);	
			}
        }

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		@Override
		public String toString() {
			return "Order [article=" + article + ", quantity=" + quantity
					+ ", orderDate=" + orderDate + "]";
		}
    }

    public List<Article> getInventory() {
        return inventory;
    }

    public void setTopTen(List<Article> inventory) {
        this.inventory = inventory;
    }
    
    private String inventoryDisplay() {
    	String result = "\n";
    	
    	for (Article article : inventory) {
			result += article.toString() + " \n";
		}
    	
    	return result;
    }

	@Override
	public String toString() {
		return "Shop [Stan Magazynowy=" + inventoryDisplay() + "]";
	}
}
