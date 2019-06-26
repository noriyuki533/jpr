public class Body {
    private String name;
    private double height, weight;
    public Body() {
	name = ""; height = 0.0; weight = 0.0;
    }
    public Body(double h, double w) {
	name =""; height = h; weight = w;
    }
    public Body(String n, double h, double w) {
	name = n; height = h; weight = w;
    }
    public double stdWeight() {
	return height * height * 22 / 10000;
    }
    public void print() {
	System.out.println(" name : " + name);
	System.out.println("height : " + height + " cm");
	System.out.println("weight : " + weight + " kg");
    }

    public void setName(String s){
	name = s;
    }

    public void setHeight(double h){
	height = h;
    }

    public void setWeight(double w){
	weight = w;
    }
}
