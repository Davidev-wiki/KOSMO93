package a.b.c.ch4;

public class Ex_MessageInterfaceEngImpl implements Ex_MessageInterface
{
	@Override
	public void sayHello(String name){
		System.out.println("Hey, What's up? : " + name + "~");
	}
}
