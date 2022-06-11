create view time_view as
select hora,count(hora) as frequency from player group by (hora)

