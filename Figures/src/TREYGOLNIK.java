class TREYGOLNIK{
        private int x,y,z;
        TREYGOLNIK(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        double getVolumee(){
            return(this.x+this.y+this.z);
        }
        double poly(){
            return(getVolumee()/2);
        }
        double area(){
        return(Math.sqrt(poly()*(poly()-this.x)*(poly()-this.y)*(poly()-this.z)));
        }
    }