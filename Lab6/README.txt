Partner: Rebecca Lassman, Megan Louie <3

In-Class Activity 2:
    Part 1:
        sanity1: 
        easy1: 111111
        easy2: aaaaaaaaaa
        path1: ABCDEFGHIJ
        path2: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        path3: 
            aaaaaaaaaaaaaaaaaaaaa
            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

Lab6
    Part 1:
        parse_json.c: the program crashes when the input is a list with brackets, the bracket things triggers the abort() method.
            {
                "name": "John Doe",
                "age": 30,
                "email": "johndoe@example.com",
                "isStudent": false,
                "courses": ["Math", "Science", "History"],
                "address": {
                    "street": "123 Main St",
                    "city": "Anytown",
                    "state": "CA",
                    "zip": "12345"
                }
            }
    Part 2:
        easy1:
            detected a crash in 1 second
            input: st
        easy2: 
            detected a crash in 1 second
            input: ED>a�D�w�U
        path1: 
            detected a crash in 4 seconds
            input: 'BEDB'''DA�H'EcBC'''�BFEDBCAgGGIBED'DA�H'EcBC'''�BFEDBCAgGGIBEDA�IJCA>
        path2:
            detected a crash in 1 minute 50 seconds
            input: keke�o�o�ooooooooo����o�ob�Etoooo��y��������o�o|oMoooooo���Z���o�o�o�oo�ooooooOooooooo�oRoZ���o�o�o�k��oo�_ooo�ooo��y�p�o|oMoooooo���ooooooooooo���ooooooooooooooooooo�������o�o|oMoooooo�o|oMoooooo�����tooZ���~ommmmmmmmmmmm�o�o�oo�oooe
        path3: 
            detected a crash in 4 minutes 30 seconds
            input: �*��*<F**** 8****0
                *�*���*����������&����&&&&�������������8****0
                *�*�����*���������������������&����&&&&�����������������&&&&&&B&;&&&:&&&E��������&&& &&&&&&&&&;&&&&�����������������&&&��es*�st
        parse_json: 
            detected a crash in 16 seconds
            input: {�;��;:[:I�:::9:::I�::::::]I��}
    Part 3:
        easy1:
            seed: aaaaa
            crash: 1 second
            input: �������
        easy2: 
            seed: aaaaa
            crash: 1 second
            input: aaaaaaaaaaaaaaaa
        path1: 
            seed: ABCDEFGHI
            crash: 1 second
            input: ABCDEFGHIJ
        path2: 
            seed: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            crash: 20 seconds
            input: a!a���aabajaa_baaaaaaaaaaaaaZaaaaabaaIaaaaaaaaa�aaa@aaaaaaaaaaaa�aaZaaaaabaaaabaaaaaama�aaaaabajaa�iaaaaabaaaaaaaaa���Caaaabaaaaaama�aaabala�uaOazuabaaaaaaaiaaaaaaaaa�iaDaaabaaaaaaaaaaaaaaUUUUUUUaaaaabaaaabaaaaaama�aaaaabaUUUUUUUUU�Uaaaa��
        path3: 
            seed: �*��*<F**** 8****0
                *�*���*����������&����&&&&�������������8****0
                *�*�����*���������������������&����&&&&�����������������&&&&&&B&;&&&:&&&E��������&&& &&&&&&&&&;&&&&�����������������&&&��es*�s
            crash: 20 seconds
            input: �￿es*�����*<F��쿽�����濽
                ������������������������������������쿲￿
                ���ﾽ���&�����es*���￼������������*�����@���*�&p&���777777777777�� ���ﾽ�￿�����諾��C��&&&�п�es*�
        parse_json: 
            seed: [aaaaaa
            crash: 3 seconds
            input: {��{][}}
    Lab Report:
        Difference in Crash Time:
            easy1: 0 seconds difference
            easy2: 0 seconds difference
            path1: 3 seconds difference
            path2: 1 minute 30 seconds difference
            path3: 4 minutes 10 seconds difference
            parse_json: 13 seconds difference
        path2 and path3 took the longest to crash. Both of these programs took in longer input strings, so it may have taken a while to generate longer strings to crash them.
        The other four all crashed fairly quickly, but easy1, easy2, and path1 crashed in less than a second when fed a specially designed seed. I think this is because their inputs are very short, and also because the seeds were tailor-made for the program and only require minor adjustments or additions to crash.
        path3 benefitted most from having a seed provided as the difference in time was the greatest. I assume this is because path3 seemed to require the most complex input string. There needed to be three separate input strings of designated length, and the third input string was quite long. So it could have been more difficult to try and achieve that exact format if the program was randomly generating inputs.