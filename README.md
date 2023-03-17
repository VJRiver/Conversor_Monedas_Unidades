# Conversor Monedas
<h2>Programa para convertir entre algunas divisas y otras unidades</h2>
![Conversor Monedas](https://user-images.githubusercontent.com/38737685/222485160-2ccdcd9c-ee25-4691-9de3-1a90616b91ea.png)
<br><hr><br>

El programa usa Java Swing, construido con la herramienta WindowBuilder y el IDE Eclipse.

<h3>Conversiones que realiza</h3>

El programa convierte las siguientes unidades:

<ul>
  <li>Conversión de monedas</li>
  <li>Conversión de Temperaturas</li>
  <li>Conversión de Longitudes</li>
  <li>Conversión de Masa (peso)</li>
</ul>

Las monedas que convierte son:

       - Pesos mexicanos a Dólar
       - Pesos mexicanos a Euros
       - Pesos mexicanos a Libras Esterlinas
       - Pesos mexicanos a Yen Japonés
       - Pesos mexicanos a Won sul-coreano
       
       - Dólar a Pesos mexicanos
       - Euros a Pesos mexicanos
       - Libras Esterlinas a Pesos mexicanos
       - Yen Japonés a Pesos mexicanos
       - Won sul-coreano a lPesos mexicanos
       
En cuanto a las temperaturas, convierte:

      -> Grados Celsius a Fahrenheit
      -> Grados Kelvin a Fahrenheit
      -> Grados Kelvin a Celsius
      -> Grados Fahrenheit a Celsius
      -> Grados Celsius a Kelvin
      -> Grados Fahrenheit a Kelvin
      
Longitudes:

      -> Pulgadas a centímetros
      -> Pies a metros
      -> Yardas a metros
      -> Millas a Kilómetros
      -> Kilómetros a Millas
      -> Metros a Yardas
      -> Metros a Pies
      
Masa:

      -> Onzas a Gramos
      -> Libras a Gramos
      -> Libras a Kilogramos
      -> Kilogramos a Libras
      -> Gramos a Libras
      -> Gramos a Onzas

Después de hacer la primera conversión en cada unidad, el programa pregunta al usuario si desea continuar mediante un showOptionPane, en caso de que el usuario presione "No" o "Cancel", el programa finalizará con un mensaje.

En caso de que el usuario introduzca valores no numéricos, el programa lo validará y enviará un mensaje de error en un showMessageDialog, indicando al usuario que únicamente puede usar valores numéricos.
