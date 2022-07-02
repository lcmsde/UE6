public class Binaerbaum<T> {
    BaumEl wurzel;

    class BaumEl {
        T data;
        BaumEl links;
        BaumEl rechts;

        BaumEl(T content) {
            data = content;
            links = null;
            rechts = null;
        }
    }

    public Binaerbaum() {
        wurzel = null;
    }

    public Binaerbaum(T e, Binaerbaum links, Binaerbaum rechts) {
        wurzel = new BaumEl(e);
        if (rechts != null) {
            wurzel.rechts = rechts.wurzel;
        }
        if (links != null) {
            wurzel.links = links.wurzel;
        }
    }

    public Boolean isEmpty() {
        return wurzel == null;
    }

    private int hoeheEl(BaumEl el) {
        if (el == null) {
            return 0;
        }
        return Math.max(hoeheEl(el.links), hoeheEl(el.rechts)) + 1;
    }

    public int hoehe() {
        return hoeheEl(wurzel);
    }

    public int size() {
        return sizeEl(wurzel);
    }

    private int sizeEl(BaumEl el) {
        if (el == null) {
            return 0;
        }
        return sizeEl(el.links) + sizeEl(el.rechts) + 1;
    }

    public String toString() {
        return toStringEl(wurzel);
    }

    private String toStringEl(BaumEl el) {
        if (el == null) {
            return "";
        }
        return "(" + toStringEl(el.links) + el.data + toStringEl(el.rechts) + ")";
    }

    public void preorder(){
        System.out.println(preorderEl(wurzel));
    }

    private String preorderEl(BaumEl el){
        if(el==null){
            return"";
        }
        return(el.data+preorderEl(el.links)+preorderEl(el.rechts));

    }


    public void inorder(){
        System.out.println(inorderEl(wurzel));
    }

    private String inorderEl(BaumEl el){
        if(el==null){
            return"";
        }
        return(inorderEl(el.links)+el.data+inorderEl(el.rechts));

    }


    public void postorder(){
        System.out.println(postorderEl(wurzel));
    }

    private String postorderEl(BaumEl el){
        if(el==null){
            return"";
        }
        return(postorderEl(el.links)+postorderEl(el.rechts)+el.data);

    }

    public void breitensuche(){
        EVL speicher = new EVL<BaumEl>();
        speicher.addFirst(wurzel);
        for(int i=0; i<=size();i++){

        }
    }




}
