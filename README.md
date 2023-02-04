# Revenue App

## Run

```bash
$ docker-compose up
```

### Available endpoints

- GET api/transactions // get all transactions
- POST api/transactions // create a singe transaction
- DELETE api/transactions // delete all transactions
- DELETE api/transactions/{id} // delete a singe transaction
- GET api/transactions/report // get report based on all transactions
- POST api/transactions/upload // create multiple transactions from a csv file
