SELECT w1.id FROM Weather w1 INNER JOIN Weather w2 ON TO_DAYS(w1.RecordDate) =TO_DAYS(w2.RecordDate)+1 and w1.Temperature>w2.Temperature;