//Exemple d'Arraylist sense fer servir genèrics ni autoboxing

import java.awt.Frame;
import java.util.ArrayList;
//java.lang:Byte,Short,Integer,Float,Double,...
class ExempleGrafic {
	public static void main(String argv[]) {
		ArrayList v=new ArrayList();	//Object v[]-> (Frame)v[i]).
		v.add(new Integer(1));
		//v.add(new Frame("titol"));
		v.add(new Integer(10));
		for(int i=0;i<v.size();i++) {
			System.out.println( ((Integer)v.get(i)).intValue()  );
//			if (v.get(i) instanceof Integer)
//				System.out.println( ((Integer)v.get(i)).intValue()  );		//Object get
//			if (v.get(i) instanceof Frame)
//				System.out.println( ((Frame)v.get(i)).getTitle()  );		//Object get
		}
	}
}