import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
	private String name;
	private Double price;
	private String barcode;
	private Integer remainder;
	
	
	public static List<Product> importProducts(String file) throws FileNotFoundException{
		List <Product> list = new ArrayList<>();
		File productFile = new File(file);
		Scanner scanner = new Scanner (productFile);
		
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			String [] fields = line.split(",");
			list.add(new Product(fields[0].trim(),Double.valueOf(fields[1].trim()),fields[2].trim(),Integer.valueOf(fields[3].trim())));
		}
		
		return list;
	
	}
	
	public String getName()  {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public Integer getRemainder() {
		return remainder;
	}
	public void setRemainder(Integer remainder) {
		this.remainder = remainder;
	}
	public Product(String name, Double price, String barcode, Integer remainder) {
		super();
		this.name = name;
		this.price = price;
		this.barcode = barcode;
		this.remainder = remainder;
	}
	public Product() {
		
	}
	

}
