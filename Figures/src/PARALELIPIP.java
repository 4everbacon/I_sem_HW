class PARALELIPIP {
        private int a,b,c;
        PARALELIPIP(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        double diag(){
            return(this.a*this.a+this.b*this.b+this.c*this.c);
        }
        double plo(){
            return(2*(this.a*this.b+this.a*this.c+this.b*this.c));
        }
        double ob(){
            return (this.a*this.b*this.c);
        }

    }


