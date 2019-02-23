class PRYAMOYGOLNIK{
    private int x=0,y=0;
    PRYAMOYGOLNIK(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getVolume(){
        return((this.x+this.y)*2);
    }
    int getarea(){
        return(this.x*this.y);
    }
}

