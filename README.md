# Лабы по проклятому флоу9

## Прочитай меня
лабораторные смотри по веткам, т.к. все лабораторные зависят друг от друга последовательно 
и код из 5ой переписывается в 6ой и последующих, то ветки были созданы после того, как лаба сдалась, и по возможности изменений в них после этого не происходило

можешь почекать коммиты, если не влом, они подписаны в силу своего содержания

## Запуск
я запускал через flowc1 через java, мне так было удобнее 

в Makefile есть как именно я это делал
```
../bin/flowc1 block2/lab6.flow jar=lab I=block2/arith
```

1. ../bin/flowc1 - путь до fl owc1; хз почему, но у меня не работал запуск через PATH
2. block2/lab6.flow - путь до файла который нужно скомпилировать
3. jar=lab - название итогового архива jar
4. I=block2/arith - путь до файлов которые я эскпортировал

## Важно
чтобы работало но то чтобы безотказно, а чтобы просто работало, лучше всего папку с лабами засунуть в папку flow9 которую вы предварительно скопировали с гита 

## О ветке
пятая просто пятая, только сложение и умножение