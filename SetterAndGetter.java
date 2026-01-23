public class SetterAndGetter {
    int id;

    public void set(int a){
        id = a;
    }

    public int get(){
        return id;
    }

    public static void main(String args[]){
        SetterAndGetter sg = new SetterAndGetter();
        sg.set(5);
        System.out.println(sg.get()); 
    }
}
