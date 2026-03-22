package com.example.demo.bakery;
import com.example.demo.bakery.Frosting;
import com.example.demo.bakery.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(
            @Qualifier("chocolateFrosting") Frosting frosting,
            @Qualifier("chocolateSyrup") Syrup syrup
    ) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Cake baked with "
                + frosting.getFrostingType() + " and "
                + syrup.getSyrupType());
    }
}