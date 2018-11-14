#!/bin/bash

bash /wait-for-it.sh mmozg-db:3306 --timeout=0 --strict -- echo "Database is ready!"

indexer --all

searchd --nodetach