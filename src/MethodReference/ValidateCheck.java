package MethodReference;

import java.util.Objects;

public class ValidateCheck implements Check{

    @Override
    public void Check(String a) {

        if(Objects.isNull(a)){
            System.out.println("A is null");
        }
        System.out.println("A is not null");

    }
}
