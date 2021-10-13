# Call-center
## Работа прогаммы
1. Создание и запуск потоков-специалистов и один поток-АТС (генерирует звонки)
2. Поток-АТС после запуска начинает генерировать несколько (например, 60) "звонков" раз в 1 секунду
3. Потоки-специалисты берут доступные звонки в работу
4. Методом Thread.sleep() нужно реализовать эмуляцию работы специалиста над вопросом (3-4 секунды, например)
5. Главный поток (main) ждет конца выполнения всех потоков
