package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    private CustomList mockCityList(){
        CustomList cityList = new CustomList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void mockHasCity(){
        CustomList cityList = mockCityList();
        City city = new City("Calgary", "Alberta");
        cityList.addCity(city);
        assertEquals(true,cityList.hasCity(city));
    }
}
