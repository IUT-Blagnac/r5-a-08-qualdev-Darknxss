from behave import given, when, then

@given('I have entered {number} into the calculator')
def step_impl(context, number):
    if not hasattr(context, 'numbers'):
        context.numbers = []
    context.numbers.append(int(number))

@when('I press add')
def step_impl(context):
    context.result = sum(context.numbers)

@when('I press multiply')
def step_impl(context):
    context.result = 1  
    for num in context.numbers:
        context.result *= num

@then('the result should be {expected_result} on the screen')
def step_impl(context, expected_result):
    assert context.result == int(expected_result)

