public class MedicalDiagnose extends Laboratory{
        
        public char convertGender(int gender) {
                if( gender == 1) {
                        return 'M';
                }
                return 'F';
        }
        
        
        public int getTotal() {
                int total = (int)getBMI()+getBP()+getFBS()+getCHOL()+getHDL()+getLDL()+getTG()+getA1C();
                return total;
        }
        
        public int classifyDiagnose(int total) {
                if(total<= 11) {
                        return 1;
                }else if(total>=12 && total<= 15) {
                        return 2;
                }else if(total>=16 && total<= 20) {
                        return 3;
                }else if(total>=21 && total<=28) {
                        return 4;
                }else{
                        return 5;
                }
                
        }
        
        public String getCondition(int diagnose) {
                if(diagnose == 1) {
                        return "Excellent";
                }else if(diagnose==1) {
                        return "Very Good";
                }else if(diagnose == 3) {
                        return "Good";
                }else if(diagnose == 4) {
                        return "Bad";
                }else{
                        return "Critical";
                }
                
        }


        
        public String toString() {
                return getPid() + "\t" + getAge() + "\t" + convertGender(getGender()) + "\t" + getBMI() + "\t" + getBP() + "\t"
                                + getFBS() + "\t" + getCHOL() + "\t" + getHDL() + "\t" + getLDL() + "\t" + getTG() + "\t" + getA1C() + "\t"
                                + getTotal() + "\t" + classifyDiagnose(getTotal()) + "\t" + getCondition(classifyDiagnose(getTotal()));
        }

        
}

