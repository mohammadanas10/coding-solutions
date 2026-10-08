Select distinct player_name,score from players join matches on player_name=winner order by score desc limit 3;
