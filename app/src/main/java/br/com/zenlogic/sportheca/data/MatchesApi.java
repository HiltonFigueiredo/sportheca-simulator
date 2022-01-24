package br.com.zenlogic.sportheca.data;

import java.util.List;

import br.com.zenlogic.sportheca.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
