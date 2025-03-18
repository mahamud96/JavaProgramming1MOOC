/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
public class MatchStats {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public MatchStats(String homeTeam, String awayTeam, int homeScore, int awayScore){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    

    public String toSring(){
        if(homeScore > awayScore){
            return homeTeam;
        }
        
        return awayTeam;
    }
    
    
}

