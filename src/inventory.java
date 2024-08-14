public class inventory {
private String productname;

private String producttype;

private String productnumber;

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber;
    }

    public String getProductname() {
        return productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public String getProductnumber() {
        return productnumber;
    }

    public inventory(String productname, String producttype, String productnumber) {
        this.productname = productname;
        this.producttype = producttype;
        this.productnumber = productnumber;
    }
}
