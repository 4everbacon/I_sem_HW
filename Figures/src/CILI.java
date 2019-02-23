public class CILI {
        private int h,r;
        CILI(int h,int r){
            this.h=h;
            this.r=r;
        }
        double ploboka(){
            return(2*Math.PI*this.r*this.h);
        }
        double plosn(){
            return(Math.PI*this.r*this.r);
        }
        double plocili(){
            return (ploboka()+2*plosn());
        }
        double obcili(){
            return(plosn()*this.h);
        }

    }



