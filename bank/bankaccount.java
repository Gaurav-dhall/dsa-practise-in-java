package bank;

 class Account {
        public String name;//remove public to make default
        protected String email;
        private String pasword;

        public String getpass(){
            return this.pasword;
        }

        public void setpass(String pass){
            this.pasword=pass;
            return;
        }
    }

public class bankaccount {
    public static void main(String[] args) {
        Account a1= new Account();
        a1.name="shyamaju";
        a1.email="shreeji@shyamsundar.world";
        a1.setpass("radhe radhe");
       System.out.println(a1.getpass()); 
        // a1.password="radheradhe";

    }

    
    
}
