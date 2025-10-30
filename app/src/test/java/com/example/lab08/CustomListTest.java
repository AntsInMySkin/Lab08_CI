package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void mockDelCity(){
        CustomList cityList = mockCityList();
        City city = new City("Calgary", "Alberta");
        cityList.delCity(city);
        assertFalse(Arrays.asList(cityList).contains(city));
    }

    @Test
    public void mockCountCity(){
        CustomList cityList = mockCityList();
        int count = cityList.countCity();
        assertEquals(1, count);
    }
}
