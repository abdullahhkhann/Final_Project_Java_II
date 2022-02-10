import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Project {
        
        static String file;
        static String filePath = "C:\\Users\\user\\Desktop\\FinalProject\\Final\\src\\";
        
        public static void main(String[] args) throws IOException, NumberFormatException {
                ArrayList<Patient> patients = new ArrayList<>();
                ArrayList<String> readFileLines = readFile();
                for (String string : readFileLines) {
                        String[] split = string.split(" ");
                        MedicalDiagnose patient =  new MedicalDiagnose();
                        patient.setPid(Integer.parseInt(split[0]));
                        patient.setAge(Integer.parseInt(split[1]));
                        patient.setGender(Integer.parseInt(split[2]));
                        patient.setWeight(Double.parseDouble(split[3]));
                        patient.setHeight(Double.parseDouble(split[4]));
                        patient.mapBMI();
                        patient.mapBP(Integer.parseInt(split[5]), Integer.parseInt(split[6]));
                        patient.mapFBS(Double.parseDouble(split[7]));
                        patient.mapCholestrol(Double.parseDouble(split[8]));
                        patient.mapLDL(Double.parseDouble(split[9]));
                        patient.mapHDL(Double.parseDouble(split[10]));
                        patient.mapTG(Double.parseDouble(split[11]));
                        patient.mapA1C(Double.parseDouble(split[12]));
                        patients.add(patient);
                }
                
                writeToFile(patients);
                
        }
       
        public static void writeToFile(List<Patient> patients) {
                try {
                      FileWriter myWriter = new FileWriter(filePath+"convertedMedicalRecords.txt");
                      for (Patient patient : patients) {
                          myWriter.write(patient.toString()+"\n");
                      }
                      
                      myWriter.close();
                    } catch (IOException e) {
                      e.printStackTrace();
                    }
        }
        
        
    public static ArrayList<String> readFile() throws IOException{
        

        
        file = filePath + "PatientsHealthRecords.txt";
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.lines().forEach((currentLine)->{
            lines.add(currentLine);
            
        });
        
        reader.close();
        return lines;
        
    }

}

