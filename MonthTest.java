
public class MonthTest {

	public static void main(String[] args)
{
		Month M = new Month(4);
		System.out.println(M);
		Month M1 = new Month("May");
		System.out.println(M1);
		System.out.println("are April and May the same ? " + (M.equals(M1)?"True":"False"));
		System.out.println("is April greater than May ? " + (M.greaterThan(M1)?"True":"False"));
		System.out.println("is April less than May ? " + (M.lessThan(M1)?"True":"False"));
}
}