public class OKR {
    private int r;
    OKR(int r){
        this.r=r;
    }
    double dlina(){
        return(2*Math.PI*this.r);
    }
    double plo(){
        return(Math.PI*this.r*this.r);
    }

}
