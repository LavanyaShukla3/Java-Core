import java.util.HashMap;

public class HashAndKey{

        int hashCode;
        String key;

        public HashAndKey(int hashCode, String key){
            this.hashCode = hashCode;
            this.key = key;

        }
        public int hashCode(){
            System.out.println("Generating HashCode");
            return hashCode;
        }
        public boolean equals(Object object){
            System.out.println("Generating Equals for key:"+ object);
            return key.equals(object.toString());
        }
        public String toString(){
            return key;
        }
        public static void main(String[] args){
            HashMap<HashAndKey, String> map = new HashMap<>(99); 
            System.out.println("storing key for key1");
            map.put(new HashAndKey(1, "Andrew"), "alpha"); 
            System.out.println("storing key for key2"); 
            map.put(new HashAndKey(1, "Betty"), "bravo"); 
            System.out.println("storing key for key3"); 
            map.put(new HashAndKey(1, "Claire"), "charlie"); 
            System.out.println("storing key for key4");

            HashAndKey hp = new HashAndKey(4, "Darcy"); 
            map.put(hp, "devo"); 
            System.out.println("Now doing a get. \n\n"); 

            HashAndKey hp1 = new HashAndKey(4, "Ella"); 
            map.put(hp1, "elnoise"); 
            System.out.println("Now doing a get. \n\n"); 

            System.out.println(map.get(hp1));
        }
}