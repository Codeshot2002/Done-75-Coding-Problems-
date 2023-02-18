package com.company.dsa;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class compiler {
    static List<String> myCompiler(String code){
        int i=0,j=0;
        List<String> res = new ArrayList<>();
        for(j=0;j<code.length();j++){

            Character ch = code.charAt(j);
            if(Character.isWhitespace(ch)){
                res.add(code.substring(i,j));
                i = j;
                i++;
            }
            else if(ch == '('){
                res.add(code.substring(i,j));
                res.add("(");
                i = j;i++;
            }
            else if(ch == ')'){
                if(code.charAt(i) == ')'){
                    res.add(")");
                }
                else {
                    res.add(code.substring(i, j));
                    res.add(")");
                }
                i = j + 1;
            }
            else if(ch == ';'){
                if(code.charAt(i) == ';'){
                    res.add(";");
                }else {
                    res.add(code.substring(i,j));
                    res.add(";");
                }

            }
        }
        return res;
    }
    public static void main(String[] args)throws Exception {
        File file = new File("D:\\Java Project\\java compiler\\cod.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String text;
        String out = "";
        while((text = br.readLine()) != null){
            out += text;
            out += " ";
        }
        //System.out.println(out);
        out = out.replaceAll("\\s{2,}", " ").trim();
        System.out.println(out);
        System.out.println(myCompiler(out));
        System.out.println(myCompiler(out).size());

        String name = "u";
    }
}
