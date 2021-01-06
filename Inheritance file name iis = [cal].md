public class cla {
	public void funA()
	{
		System.out.println("this first function");
	}

}
class clb extends cla
{
	public void  name() {
		System.out.println("this is second function");
	}
}
class Main
{
	public static void main()
	{
		clb c =  new clb();
		c.funA();
		c.name();
	}
}
