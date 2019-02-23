class SFERA {

    private int x=0,y=0,z=0;
    SFERA(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    double getRadiuss() {
        return(Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z));
    }
    double getVolumes(){
        return((4/3)*Math.PI*getRadiuss()*getRadiuss()*getRadiuss());
    }
    double getareas(){
        return(4*Math.PI*getRadiuss()*getRadiuss());
    }
}
