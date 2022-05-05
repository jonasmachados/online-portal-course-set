package domain.entities;

import java.util.Objects;

public class User {

    private Integer code;
    //   private String userName;

    //   private List<Course> coursrList = new ArrayList<>();
//    //CONSTRUCTOR
//    public User(Integer code, String userName) {
//        this.code = code;
//        this.userName = userName;
//    }
    public User(Integer code) {
        this.code = code;
    }

//     public void totalStudents(Course course, Instructor instructor, String path) {
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            
//            Set<User> set = new HashSet<>();
//            
//            String line = br.readLine();
//            while (line != null) {
//
//                String[] fields = line.split(",");
//                String code = fields[0];
//                String userName = fields[1];
//               
//                set.add(new User(Integer.parseInt(code), userName));
//                line = br.readLine();
//            }
//            
//            
//            
//
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        return true;
    }
    
    
    //GET AND SET
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
