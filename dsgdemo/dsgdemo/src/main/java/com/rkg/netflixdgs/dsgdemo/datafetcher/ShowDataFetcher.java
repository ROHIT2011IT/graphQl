package com.rkg.netflixdgs.dsgdemo.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.rkg.netflixdgs.dsgdemo.domain.Review;
import com.rkg.netflixdgs.dsgdemo.domain.Show;

import java.util.List;

@DgsComponent
public class ShowDataFetcher {

    private final List<Show> shows  = List.of (
            new Show("title1", 2020, new Review[] {new Review(1, 12, "12 May 2021")}),
            new Show("title2", 2019, new Review[] {new Review(2, 20, "22 Jun 2021")}),
            new Show("title3", 2018, new Review[] {new Review(3, 50, "13 Jan 2020")}),
            new Show("title4", 2017, new Review[] {new Review(4, 23, "16 Jul 2019")})
    );

    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows(){
        return shows;
    }
}
