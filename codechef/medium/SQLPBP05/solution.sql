Select m.match_id,m.player_1,m.player_2,m.winner,m.match_date,p.score 
from Matches m 
join Players p ON m.winner=p.player_name order by m.match_date desc limit 5;