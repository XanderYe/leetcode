package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 叶振东
 * @date 2018-12-24
 */
public class No929UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet=new HashSet<>();
        for(String email:emails){
            int at=email.indexOf("@");
            String subEmail=email.substring(0,at);
            subEmail=subEmail.replaceAll("[.]","");
            if(subEmail.contains("+")){
                subEmail=subEmail.substring(0,subEmail.indexOf("+"));
            }
            emailSet.add(subEmail+email.substring(at));
        }
        return emailSet.size();
    }

    public static void main(String[] args) {
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        No929UniqueEmailAddresses no929UniqueEmailAddresses=new No929UniqueEmailAddresses();
        System.out.println(no929UniqueEmailAddresses.numUniqueEmails(emails));
    }
}
