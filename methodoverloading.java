public class methodoverloading {
    public void show()
    {
        System.out.println("1");
    }
    public void show(int a)
    {
        System.out.println("2");
    }
    public static void main(String args[]){
        methodoverloading ml=new methodoverloading();
        ml.show(1);;
    }
}
