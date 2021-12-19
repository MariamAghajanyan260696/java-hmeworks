package week5shop;

/*SHOP
Define a Shop.java class which
Has a fields name, address, countOfProduct,
priceForProduct, shopBalance.
define constructors with all possible fields
write method checkOrder() which will take as a parameter count of order, and will give a response whether they
 have such an amount of product or not.

if they don’t have that amount of product, response` “Now we don’t have so much product,sorry ”*/
public class Shop {
    private String name;
    private String address;
    private int countOfProduct;
    private int priceForProduct;
    private int shopBalance;
    public  Shop (){

    }

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;

    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("invalid name");
        } else {
            this.name = name;
        }
    }
    public String getAddress() {
        return address;

    }
    public void setAddress(String address) {
        if (address.isBlank()) {
            System.out.println("invalid address");
        } else {
            this.address = address;
        }
    }
        public int getCountOfProduct() {
            return countOfProduct;

        }
        public void setCountOfProduct(int countOfProduct) {
            if (countOfProduct>0) {
                this.countOfProduct = countOfProduct;
            } else {
                System.out.println("invalid count ");
            }
    }
    public int getPriceForProduct() {
        return priceForProduct;

    }
    public void setPriceForProduct(int priceForProduct) {
        if (priceForProduct>0) {
            this.priceForProduct = priceForProduct;
        } else {
            System.out.println("invalid price ");
        }
    }
    public int getShopBalance() {
        return shopBalance;

    }
    public void setShopBalance(int shopBalance) {
        if (shopBalance>0) {
            this.shopBalance = shopBalance;
        } else {
            System.out.println("invalid Balance  ");
        }
    }
   public void checkOrder(){
        int finalCost=priceForProduct*countOfProduct;
        if(finalCost>shopBalance){
            System.out.println("Now we don’t have so much money");
       }else{
            System.out.println("Success  "+ finalCost);
        }
   }
}