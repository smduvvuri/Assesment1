package wallet.ui;
import wallet.entity.*;
import java.util.*;
public class WalletMain {

		public static void main(String[] args)
	    {
			WalletMain mi=new WalletMain();
			mi.execute();
	    }
		
			Map<String,Walllet> store=new HashMap<>();
		    public void execute()
		    {
		    Walllet w1=new Walllet("7899","Ram",5000);
		    store.put("7899",w1);
		    Walllet w2=new Walllet("6755","Sam",7000);
		    store.put("6755",w2);
		    print();
		    Walllet fetched=findBymobno("7899");
		    System.out.println("fetch details by mobile no");
		    System.out.print(fetched.getName());
		    System.out.print("\t");
		    System.out.println(fetched.getBalance());
		    System.out.println("Transfer Amount");
		    store.put("7899",w1).transferAmount(store.put("6755",w2), 200);
		    //WalletMain w4=new WalletMain();
			//w4.print();
		    print();
		    }
		    
		    public Walllet findBymobno(String mobileno)
		    {
		    	Walllet w=store.get(mobileno);
		    	return w;
		    }

		    public void print()
			{
				Set<String> keys=store.keySet();
				for(String mobileno: keys)
				{
					Walllet w=store.get(mobileno);
					System.out.println(w.getMobileNo()+" "+w.getName()+" "+w.getBalance());}}}
