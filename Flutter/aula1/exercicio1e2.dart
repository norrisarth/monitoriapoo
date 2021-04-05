// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

main() {
  runApp(new Aplicativo());
}

class Aplicativo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      title: 'Exemplo de aplicativo',
      home: new Tela(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class Tela extends StatefulWidget {
  @override
  _TelaState createState() => _TelaState();
}

class _TelaState extends State<Tela> {
  int x = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: new AppBar(
        title: Text('Tela 1'),
        centerTitle: true,
        actions: [
          IconButton(
            icon: Icon(Icons.clear),
            onPressed: (){},
          ),
        ],
      ), // AppBar
      body: Container(
        color: Colors.purple,
        margin: EdgeInsets.only(left: 50, top: 50),
        padding: EdgeInsets.all(50),
        child: Text(
          'Numero de vezes pressionado: $x',
        ),
      ), // Container
      floatingActionButton: Stack(
        children: [
          Container(
            child: Align(
              alignment: Alignment.bottomLeft,
              child: new FloatingActionButton(
                onPressed: redesenhaIncrementando,
                child: new Icon(Icons.add),
              ),
            ),
            margin: EdgeInsets.only(left:30)
          ),
          Align(
            alignment: Alignment.bottomRight,
            child: new FloatingActionButton(
              onPressed: redesenhaIncrementando,
              child: new Icon(Icons.remove),
            ),
          ),
        ],
      ), //FloatingActionButton
    ); // Scaffold
  }

  incrementaX() {
    x++;
    print(x);
  }

  redesenhaIncrementando() {
    setState(() {
      incrementaX();
      print('aaaa');
    });
  }
}
