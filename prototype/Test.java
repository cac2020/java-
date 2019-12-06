package mode.prototype;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		Prototype a = new Prototype();
		SerializableObject obj = new SerializableObject();
		a.setNum(100);
		a.setObj(obj);
		a.setString("123");
		System.out.println(a.toString()+",num="+a.getNum()+",str="+a.getString()+",obj="+a.getObj().toString());
		//mode.prototype.Prototype@7852e922,num=100,str=123,obj=mode.prototype.SerializableObject@4e25154f
		try {
			Prototype b = (Prototype)a.clone();
			System.out.println(b.toString()+",num="+b.getNum()+",str="+b.getString()+",obj="+b.getObj().toString());
			//mode.prototype.Prototype@70dea4e,num=100,str=123,obj=mode.prototype.SerializableObject@4e25154f
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			Prototype c = (Prototype)a.deepClone();
			System.out.println(c.toString()+",num="+c.getNum()+",str="+c.getString()+",obj="+c.getObj().toString());
			//mode.prototype.Prototype@7ba4f24f,num=100,str=123,obj=mode.prototype.SerializableObject@3b9a45b3
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
