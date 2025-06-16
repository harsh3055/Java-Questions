package org.example.Strings;

public class stringBuilder {
    public static void main(String[] args){
        //string builder
        //it does not gurantee synchronization
        //used in single threaded applications
        //faster than string buffer in most cases
        StringBuilder sb = new StringBuilder("harsh goswami");
        sb.append(" urvashi prajapati");
        System.out.println(sb);
    }
}
