// רשימת מוצרים בעגלת הקניות
let cartItems = [];

// פונקציה להוספת מוצר לעגלת הקניות
function addToCart(product) {
    // בדיקה אם המוצר כבר נמצא בעגלת הקניות
    let existingItem = cartItems.find(item => item.id === product.id);

    if (existingItem) {
        // אם המוצר כבר קיים, הגדל את כמות המוצר
        existingItem.quantity++;
    } else {
        // אם המוצר עדיין לא קיים, הוסף אותו לעגלת הקניות
        cartItems.push({ id: product.id, name: product.name, price: product.price, quantity: 1 });
    }

    // הדפסה לצורך בדיקה - ניתן להחליף בלוגיקה נוספת
    console.log('מוצרים בעגלה:', cartItems);
}

// פונקציה להצגת כמות מוצרים בעגלת הקניות
function showCartItemCount() {
    let cartCountElement = document.getElementById('cart-count');
    if (cartCountElement) {
        cartCountElement.textContent = cartItems.reduce((total, item) => total + item.quantity, 0);
    }
}

// קריאה לפונקציה להצגת כמות המוצרים בעגלת הקניות בעת טעינת העמוד
showCartItemCount();
