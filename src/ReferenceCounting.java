/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-14 17:20
 **/


class Shared{
    private int refcount = 0;
    private static long counter = 0;
    private static long id = counter++;
    public Shared(){
        System.out.println("creating " + this);
    }
    public void addRef(){
        refcount ++;
    }

    protected void finalize() {
        if(refcount > 0)
            System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
    }

    protected void dispose(){
        if (--refcount == 0) {
            System.out.println("disposing " + this);
        }

    }
    public String toString(){
        return "Shared " + id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString(){
        return "composing" + id;
    }

}


public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),new Composing(shared),
        };
        for (Composing c : composings)
            c.dispose();
        Composing compTest = new Composing(shared);
        Composing compTest2 = new Composing(shared);
        // Test finalize():
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing compTest3 = new Composing(shared);
        // Test sharedTest finalize():
        shared.finalize();
    }

}
