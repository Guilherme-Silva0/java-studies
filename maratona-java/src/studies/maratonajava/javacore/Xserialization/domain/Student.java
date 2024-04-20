package studies.maratonajava.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    private Long id;
    private String name;
    private transient String password;
    private transient Class aClass;
    private static final String SCHOOL_NAME = "fds";

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(aClass.getName());
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String className = ois.readUTF();
            aClass = new Class(className);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", class='" + aClass + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
