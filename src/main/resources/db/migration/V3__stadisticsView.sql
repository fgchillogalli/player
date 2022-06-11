create view cancha_view as
select cancha,count(cancha) as frequency from player group by (cancha)

