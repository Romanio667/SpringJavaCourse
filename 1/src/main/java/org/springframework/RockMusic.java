package org.springframework;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
