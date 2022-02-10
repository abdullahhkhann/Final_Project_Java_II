public class Laboratory extends Patient implements LabMapping{

        private double BMI;
        private int BP;
        private int FBS;
        private int CHOL;
        private int HDL;
        private int LDL;
        private int TG;
        private int A;
        private int A1C;
          
        public double mapBMI() {

                double BMI = getBMI();
                if (BMI<=17.9) {
                        this.BMI = 0;
                        return 0;
                } else if (BMI>17.9 && BMI<=24.9) {
                        this.BMI = 1;
                        return 1;
                } else if (BMI>24.9 && BMI<=29.9) {
                        this.BMI = 2;
                        return 2;
                } else {
                        this.BMI = 3;
                        return 3;
                }
        }

        
        public int mapBP(int sbp, int dbp) {
                
                if(sbp<130 && dbp<80) {
                        this.BP = 1;
                        return 1;
                }else if(sbp<=130 && dbp == 80) {
                        this.BP = 2;
                        return 2;
                }else if(sbp>130 && dbp<100) {
                        this.BP = 3;
                        return 3;
                }else if(sbp<150 && dbp>100) {
                        this.BP = 4;
                        return 4;
                }else if(sbp>200) {
                        this.BP = 5;
                        return 5;
                }
                return 0;
                
        }


        
        public int mapFBS(double fbs) {
        	
                if(fbs>=70 && fbs<= 100) {
                        this.FBS = 1;
                        return 1;
                }else if(fbs>=111 && fbs<= 140) {
                        this.FBS = 2;
                        return 2;
                }else if(fbs>=141 && fbs<= 200) {
                        this.FBS = 3;
                        return 3;
                }else if(fbs>=201 && fbs<= 300) {
                        this.FBS = 4;
                        return 4;
                }else if(fbs>=301 && fbs<= 400) {
                        this.FBS = 5;
                        return 5;
                }
                return 0;
        }

        

        
        public int mapCholestrol(double chol) {
               
                if(chol>=50 && chol<= 149) {
                        this.CHOL = 1;
                        return 1;
                }else if(chol>=150 && chol<= 184) {
                        this.CHOL = 2;
                        return 2;
                }else if(chol>=185 && chol<= 199) {
                        this.CHOL = 3;
                        return 3;
                }else if(chol>=200 && chol<= 249) {
                        this.CHOL = 4;
                        return 4;
                }else if(chol>=240 && chol<= 500) {
                        this.CHOL = 5;
                        return 5;
                }
                return 0;
        }


       
        public int mapHDL(double hdl) {
        	
                if(hdl>=0 && hdl<= 39) {
                        this.HDL = 5;
                        return 5;
                }else if(hdl>=40 && hdl<= 59) {
                        this.HDL = 4;
                        return 4;
                }else if(hdl>=60 && hdl<= 74) {
                        this.HDL = 3;
                        return 3;
                }else if(hdl>=75 && hdl<= 99) {
                        this.HDL = 2;
                        return 2;
                }else if(hdl>=100 && hdl<= 200) {
                        this.HDL = 1;
                        return 1;
                }
                return 0;
        }

        
        public int mapLDL(double ldl) {

                if(ldl>=0 && ldl<= 99) {
                        this.LDL = 1;
                        return 1;
                }else if(ldl>=100 && ldl<= 129) {
                        this.LDL = 2;
                        return 2;
                }else if(ldl>=130 && ldl<= 159) {
                        this.LDL = 3;
                        return 3;
                }else if(ldl>=160 && ldl<= 189) {
                        this.LDL = 4;
                        return 4;
                }else if(ldl>=190 && ldl<= 500) {
                        this.LDL = 5;
                        return 5;
                }
                return 0;
        }

       
        public int mapTG(double tg) {
    
                if(tg>=0 && tg<= 149) {
                        this.TG = 1;
                        return 1;
                }else if(tg>=150 && tg<= 179) {
                        this.TG = 2;
                        return 2;
                }else if(tg>=180 && tg<= 199) {
                        this.TG = 3;
                        return 3;
                }else if(tg>=200 && tg<= 499) {
                        this.TG = 4;
                        return 4;
                }else if(tg>=500 && tg<= 1000) {
                        this.TG = 5;
                        return 5;
                }
                return 0;
        }


       
        public int mapA1C(double a1c) {
           
                if(a1c>=4 && a1c<= 6) {
                        this.A1C = 1;
                        return 1;
                }else if(a1c>=6.1 && a1c<= 7) {
                        this.A1C = 2;
                        return 2;
                }else if(a1c>=7.1 && a1c<= 8) {
                        this.A1C = 3;
                        return 3;
                }else if(a1c>=8.1 && a1c<= 9) {
                        this.A1C = 4;
                        return 4;
                }else if(a1c>=9.1 && a1c<= 20) {
                        this.A1C = 5;
                        return 5;
                }
                return 0;
        }

        public double getBMI() {
                return BMI;
        }

        public void setBMI(double bMI) {
                BMI = bMI;
        }

        public int getBP() {
                return BP;
        }

        public void setBP(int bP) {
                BP = bP;
        }

        public int getFBS() {
                return FBS;
        }

        public int getCHOL() {
                return CHOL;
        }

        public void setCHOL(int cHOL) {
                CHOL = cHOL;
        }

        public int getHDL() {
                return HDL;
        }

        public void setHDL(int hDL) {
                HDL = hDL;
        }

        public int getLDL() {
                return LDL;
        }

        public void setLDL(int lDL) {
                LDL = lDL;
        }

        public int getTG() {
                return TG;
        }

        public void setTG(int tG) {
                TG = tG;
        }

        public int getA() {
                return A;
        }

        public void setA(int a) {
                A = a;
        }

        public int getA1C() {
                return A1C;
        }

        public void setA1C(int a1c) {
                A1C = a1c;
        }
}