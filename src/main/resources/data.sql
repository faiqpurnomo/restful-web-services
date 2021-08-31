insert into user values(1111, sysdate(), 'John');
insert into user values(1112, sysdate(), 'Clayton');
insert into user values(1113, sysdate(), 'Mayer');
insert into post values(1211, 'Sob Rock is Cool', 1111);
insert into post values(1212, 'Continuum is cooler though', 1111);
insert into balance values('115471119','Shopee Coins','16732765949981','IDR', '0', '16732765949981,2', 'JONOMADE', '1', '0001');
insert into balance values('118561119','Dana Pay','18567765949981','IDR', '0', '18567765949981,7', 'JONMAYER', '1', '0001');
insert into balance values('008','GoPay','50000','IDR', '0', '50000,7', 'Faiq Purnomo', '1', '0001');
insert into amount values (1, 10000,'IDR', '008');
insert into float_amount values (1, 10000,'IDR', '008');
insert into hold_amount values (1, 'IDR', 10000, '008');
insert into customer values('008','10000000', 'Faiq Purnomo', 'Admin Fee', 'LA001','883737GHY8839');
insert into min_amount values (100, 100000,'IDR', '008');
insert into max_amount values (100, 100000,'IDR', '008');
insert into fee_amount values (100, 1000,'IDR', '008');
insert into customer_amount values (100, 100000,'IDR', '008');
insert into customer_transaction values ('008', '12345', '8976228289167', '080989999')